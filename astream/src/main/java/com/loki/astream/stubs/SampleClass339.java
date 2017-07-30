package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass339 {

    @Ignore    private SampleClass340 sampleClass;

    public SampleClass339(){
        sampleClass = new SampleClass340();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}