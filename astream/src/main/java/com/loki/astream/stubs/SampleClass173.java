package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass173 {

    @Ignore    private SampleClass174 sampleClass;

    public SampleClass173(){
        sampleClass = new SampleClass174();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}