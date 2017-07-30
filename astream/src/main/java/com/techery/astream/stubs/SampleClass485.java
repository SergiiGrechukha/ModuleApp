package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass485 {

    @Ignore    private SampleClass486 sampleClass;

    public SampleClass485(){
        sampleClass = new SampleClass486();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}