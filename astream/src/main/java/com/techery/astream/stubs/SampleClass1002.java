package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1002 {

    @Ignore    private SampleClass1003 sampleClass;

    public SampleClass1002(){
        sampleClass = new SampleClass1003();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}