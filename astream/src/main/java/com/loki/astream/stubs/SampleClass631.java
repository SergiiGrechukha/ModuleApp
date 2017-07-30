package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass631 {

    @Ignore    private SampleClass632 sampleClass;

    public SampleClass631(){
        sampleClass = new SampleClass632();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}