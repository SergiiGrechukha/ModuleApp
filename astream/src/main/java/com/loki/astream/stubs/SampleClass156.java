package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass156 {

    @Ignore    private SampleClass157 sampleClass;

    public SampleClass156(){
        sampleClass = new SampleClass157();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}