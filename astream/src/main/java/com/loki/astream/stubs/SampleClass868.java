package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass868 {

    @Ignore    private SampleClass869 sampleClass;

    public SampleClass868(){
        sampleClass = new SampleClass869();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}