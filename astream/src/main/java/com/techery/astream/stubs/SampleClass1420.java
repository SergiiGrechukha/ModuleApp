package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1420 {

    @Ignore    private SampleClass1421 sampleClass;

    public SampleClass1420(){
        sampleClass = new SampleClass1421();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}