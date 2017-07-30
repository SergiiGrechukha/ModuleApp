package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass194 {

    @Ignore    private SampleClass195 sampleClass;

    public SampleClass194(){
        sampleClass = new SampleClass195();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}