package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass801 {

    @Ignore    private SampleClass802 sampleClass;

    public SampleClass801(){
        sampleClass = new SampleClass802();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}