package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1535 {

    @Ignore    private SampleClass1536 sampleClass;

    public SampleClass1535(){
        sampleClass = new SampleClass1536();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}