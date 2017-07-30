package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass256 {

    @Ignore    private SampleClass257 sampleClass;

    public SampleClass256(){
        sampleClass = new SampleClass257();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}