package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1559 {

    @Ignore    private SampleClass1560 sampleClass;

    public SampleClass1559(){
        sampleClass = new SampleClass1560();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}