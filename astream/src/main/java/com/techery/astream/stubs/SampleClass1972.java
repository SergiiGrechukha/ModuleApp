package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1972 {

    @Ignore    private SampleClass1973 sampleClass;

    public SampleClass1972(){
        sampleClass = new SampleClass1973();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}