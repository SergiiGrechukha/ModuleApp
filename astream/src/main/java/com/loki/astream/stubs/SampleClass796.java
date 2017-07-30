package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass796 {

    @Ignore    private SampleClass797 sampleClass;

    public SampleClass796(){
        sampleClass = new SampleClass797();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}