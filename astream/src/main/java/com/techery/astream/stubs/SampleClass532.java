package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass532 {

    @Ignore    private SampleClass533 sampleClass;

    public SampleClass532(){
        sampleClass = new SampleClass533();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}