package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1447 {

    @Ignore    private SampleClass1448 sampleClass;

    public SampleClass1447(){
        sampleClass = new SampleClass1448();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}