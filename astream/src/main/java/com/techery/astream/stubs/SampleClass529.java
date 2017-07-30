package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass529 {

    @Ignore    private SampleClass530 sampleClass;

    public SampleClass529(){
        sampleClass = new SampleClass530();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}