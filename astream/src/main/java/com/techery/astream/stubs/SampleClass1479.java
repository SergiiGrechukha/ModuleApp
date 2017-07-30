package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1479 {

    @Ignore    private SampleClass1480 sampleClass;

    public SampleClass1479(){
        sampleClass = new SampleClass1480();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}