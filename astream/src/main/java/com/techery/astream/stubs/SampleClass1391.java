package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1391 {

    @Ignore    private SampleClass1392 sampleClass;

    public SampleClass1391(){
        sampleClass = new SampleClass1392();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}