package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1321 {

    @Ignore    private SampleClass1322 sampleClass;

    public SampleClass1321(){
        sampleClass = new SampleClass1322();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}