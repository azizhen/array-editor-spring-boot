package hendricks.za.co.controller;

import hendricks.za.co.arrayutils.CropUtil;
import hendricks.za.co.arrayutils.FillUtil;
import hendricks.za.co.arrayutils.ReplaceUtil;
import hendricks.za.co.arrayutils.SmoothUtil;
import hendricks.za.co.domain.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Controller responsible for exposing functionality via REST
 *
 * @author  Aziz Hendricks
 * @version 1.0
 * @since   2016-09-06
 */

@Api(value = "/arrayeditor", description = "Array Editor API")
@RestController
public class ArrayEditorController {

    private static final String template = "Welcome to ArrayEditor API. API is up!, %s!";
    private final AtomicLong counter = new AtomicLong();

    @ApiOperation(value = "replace", notes = "Replace all instances of one value with another", response = ArrayOutput.class, responseContainer = "Object")
    @RequestMapping(value = "/arrayeditor/replace", method = RequestMethod.POST)
    public ResponseEntity <ArrayOutput> replace (@RequestBody ReplaceInput replaceInput) {

        ReplaceUtil replaceUtil = new ReplaceUtil();
        int [] array = replaceUtil.replaceValuesInArray(replaceInput.getInputArray(),
                replaceInput.getNumberToReplace(), replaceInput.getReplacementNumber());
        ArrayOutput arrayOutput = new ArrayOutput();
        arrayOutput.setOutputArray(array);

        return new ResponseEntity <ArrayOutput>(arrayOutput, HttpStatus.OK);
    }

    @ApiOperation(value = "crop", notes = "Change the size of the array (for example, if the input array is 100 elements, crop it so that the output is only elements 10 to 20: the size of the output array is 10).", response = ArrayOutput.class, responseContainer = "Object")
    @RequestMapping(value = "/arrayeditor/crop", method = RequestMethod.POST)
    public ResponseEntity <ArrayOutput> replace (@RequestBody CropInput cropInput) {

        CropUtil cropUtil = new CropUtil();

        int [] array = cropUtil.cropArray(cropInput.getInputArray(), cropInput.getCropStartPosition(), cropInput.getCropEndPosition());

        ArrayOutput arrayOutput = new ArrayOutput();
        arrayOutput.setOutputArray(array);

        return new ResponseEntity <ArrayOutput>(arrayOutput, HttpStatus.OK);
    }

    @ApiOperation(value = "fill", notes = "Similar to replace: Starting at a given index in an array, replace adjacent elements if their value is the same", response = ArrayOutput.class, responseContainer = "Object")
    @RequestMapping(value = "/arrayeditor/fill", method = RequestMethod.POST)
    public ResponseEntity <ArrayOutput> fill (@RequestBody FillInput fillInput) {

        FillUtil fillUtil = new FillUtil();
        int [] array = fillUtil.fill(fillInput.getInputArray(), fillInput.getArrayIndex(), fillInput.getFillValue());
        ArrayOutput arrayOutput = new ArrayOutput();
        arrayOutput.setOutputArray(array);

        return new ResponseEntity <ArrayOutput>(arrayOutput, HttpStatus.OK);
    }

    @ApiOperation(value = "smooth", notes = "Replace values smaller than a minimum and larger with a maximum with the average of their neighbours", response = ArrayOutput.class, responseContainer = "Object")
    @RequestMapping(value = "/arrayeditor/smooth", method = RequestMethod.POST)
    public ResponseEntity <ArrayOutputDouble> smooth(@RequestBody SmoothInput smoothInput) {

        SmoothUtil smoothUtil = new SmoothUtil();
        double [] array = smoothUtil.smooth(smoothInput.getInputArray(), smoothInput.getSmoothMin(), smoothInput.getSmoothMax());
        ArrayOutputDouble arrayOutput = new ArrayOutputDouble();
        arrayOutput.setOutputArray(array);

        return new ResponseEntity <ArrayOutputDouble>(arrayOutput, HttpStatus.OK);
    }

    @ApiOperation(value = "arrayeditor", notes = "Returns a Greeting to confirm that the ArrayEditor API is active ", response = String.class, responseContainer = "String")
    @RequestMapping(value = "/arrayeditor", method = RequestMethod.GET    )
    public Greeting greeting(@RequestParam(value="name", defaultValue="Aziz") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }


}
