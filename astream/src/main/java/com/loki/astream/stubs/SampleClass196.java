package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass196 {

    @Ignore    private SampleClass197 sampleClass;

    public SampleClass196(){
        sampleClass = new SampleClass197();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}