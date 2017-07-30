package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass995 {

    @Ignore    private SampleClass996 sampleClass;

    public SampleClass995(){
        sampleClass = new SampleClass996();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}