package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass22 {

    @Ignore    private SampleClass23 sampleClass;

    public SampleClass22(){
        sampleClass = new SampleClass23();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}