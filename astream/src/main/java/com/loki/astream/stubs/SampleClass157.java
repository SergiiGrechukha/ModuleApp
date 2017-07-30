package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass157 {

    @Ignore    private SampleClass158 sampleClass;

    public SampleClass157(){
        sampleClass = new SampleClass158();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}