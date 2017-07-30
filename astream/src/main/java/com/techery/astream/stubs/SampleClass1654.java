package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1654 {

    @Ignore    private SampleClass1655 sampleClass;

    public SampleClass1654(){
        sampleClass = new SampleClass1655();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}