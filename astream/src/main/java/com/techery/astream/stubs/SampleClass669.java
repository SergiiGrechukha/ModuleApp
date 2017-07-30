package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass669 {

    @Ignore    private SampleClass670 sampleClass;

    public SampleClass669(){
        sampleClass = new SampleClass670();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}