package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass150 {

    @Ignore    private SampleClass151 sampleClass;

    public SampleClass150(){
        sampleClass = new SampleClass151();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}