package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass862 {

    @Ignore    private SampleClass863 sampleClass;

    public SampleClass862(){
        sampleClass = new SampleClass863();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}