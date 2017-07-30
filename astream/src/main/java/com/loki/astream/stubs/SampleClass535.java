package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass535 {

    @Ignore    private SampleClass536 sampleClass;

    public SampleClass535(){
        sampleClass = new SampleClass536();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}