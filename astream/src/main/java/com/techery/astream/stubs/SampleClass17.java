package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass17 {

    @Ignore    private SampleClass18 sampleClass;

    public SampleClass17(){
        sampleClass = new SampleClass18();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}