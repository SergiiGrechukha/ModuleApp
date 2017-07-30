package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass179 {

    @Ignore    private SampleClass180 sampleClass;

    public SampleClass179(){
        sampleClass = new SampleClass180();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}