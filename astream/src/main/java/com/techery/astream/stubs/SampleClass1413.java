package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1413 {

    @Ignore    private SampleClass1414 sampleClass;

    public SampleClass1413(){
        sampleClass = new SampleClass1414();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}