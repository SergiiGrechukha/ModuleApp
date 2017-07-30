package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1446 {

    @Ignore    private SampleClass1447 sampleClass;

    public SampleClass1446(){
        sampleClass = new SampleClass1447();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}