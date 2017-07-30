package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass938 {

    @Ignore    private SampleClass939 sampleClass;

    public SampleClass938(){
        sampleClass = new SampleClass939();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}