package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1449 {

    @Ignore    private SampleClass1450 sampleClass;

    public SampleClass1449(){
        sampleClass = new SampleClass1450();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}