package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass625 {

    @Ignore    private SampleClass626 sampleClass;

    public SampleClass625(){
        sampleClass = new SampleClass626();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}