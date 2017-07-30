package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass732 {

    @Ignore    private SampleClass733 sampleClass;

    public SampleClass732(){
        sampleClass = new SampleClass733();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}