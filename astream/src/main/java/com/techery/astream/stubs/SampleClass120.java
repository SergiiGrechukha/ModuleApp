package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass120 {

    @Ignore    private SampleClass121 sampleClass;

    public SampleClass120(){
        sampleClass = new SampleClass121();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}