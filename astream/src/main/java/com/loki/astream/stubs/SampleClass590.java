package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass590 {

    @Ignore    private SampleClass591 sampleClass;

    public SampleClass590(){
        sampleClass = new SampleClass591();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}