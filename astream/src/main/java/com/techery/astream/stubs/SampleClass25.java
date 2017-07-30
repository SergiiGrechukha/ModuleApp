package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass25 {

    @Ignore    private SampleClass26 sampleClass;

    public SampleClass25(){
        sampleClass = new SampleClass26();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}