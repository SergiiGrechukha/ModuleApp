package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1595 {

    @Ignore    private SampleClass1596 sampleClass;

    public SampleClass1595(){
        sampleClass = new SampleClass1596();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}