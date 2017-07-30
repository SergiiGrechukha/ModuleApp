package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass579 {

    @Ignore    private SampleClass580 sampleClass;

    public SampleClass579(){
        sampleClass = new SampleClass580();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}