package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass43 {

    @Ignore    private SampleClass44 sampleClass;

    public SampleClass43(){
        sampleClass = new SampleClass44();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}