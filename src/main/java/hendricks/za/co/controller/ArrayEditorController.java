package hendricks.za.co.controller;

import hendricks.za.co.arrayutils.ReplaceUtil;
import hendricks.za.co.domain.ArrayOutput;
import hendricks.za.co.domain.Greeting;
import hendricks.za.co.domain.ReplaceInput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by aziz on 2016/06/07.
 */

@RestController
public class ArrayEditorController {

    private static final String template = "Aziz Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(value = "/arrayeditor/replace", method = RequestMethod.POST)
    public ResponseEntity <ArrayOutput> replace (@RequestBody ReplaceInput replaceInput) {

        ReplaceUtil replaceUtil = new ReplaceUtil();
        int [] array = replaceUtil.replaceValuesInArray(replaceInput.getInputArray(),
                replaceInput.getNumberToReplace(), replaceInput.getReplacementNumber());
        ArrayOutput arrayOutput = new ArrayOutput();
        arrayOutput.setOutputArray(array);

        return new ResponseEntity <ArrayOutput>(arrayOutput, HttpStatus.OK);
    }


}
