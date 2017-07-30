package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass596 {

    @Ignore    private SampleClass597 sampleClass;

    public SampleClass596(){
        sampleClass = new SampleClass597();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}