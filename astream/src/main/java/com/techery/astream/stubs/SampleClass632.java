package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass632 {

    @Ignore    private SampleClass633 sampleClass;

    public SampleClass632(){
        sampleClass = new SampleClass633();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}