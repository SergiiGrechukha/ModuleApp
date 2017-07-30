package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass41 {

    @Ignore    private SampleClass42 sampleClass;

    public SampleClass41(){
        sampleClass = new SampleClass42();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}