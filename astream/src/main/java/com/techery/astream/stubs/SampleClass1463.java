package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1463 {

    @Ignore    private SampleClass1464 sampleClass;

    public SampleClass1463(){
        sampleClass = new SampleClass1464();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}