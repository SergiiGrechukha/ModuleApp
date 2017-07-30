package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass321 {

    @Ignore    private SampleClass322 sampleClass;

    public SampleClass321(){
        sampleClass = new SampleClass322();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}