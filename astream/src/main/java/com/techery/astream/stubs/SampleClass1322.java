package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1322 {

    @Ignore    private SampleClass1323 sampleClass;

    public SampleClass1322(){
        sampleClass = new SampleClass1323();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}