package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1760 {

    @Ignore    private SampleClass1761 sampleClass;

    public SampleClass1760(){
        sampleClass = new SampleClass1761();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}