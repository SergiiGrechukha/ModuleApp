package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1387 {

    @Ignore    private SampleClass1388 sampleClass;

    public SampleClass1387(){
        sampleClass = new SampleClass1388();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}