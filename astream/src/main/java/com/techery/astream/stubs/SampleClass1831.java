package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1831 {

    @Ignore    private SampleClass1832 sampleClass;

    public SampleClass1831(){
        sampleClass = new SampleClass1832();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}